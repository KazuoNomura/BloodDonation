package com.blooddonation.app.repository;

import com.blooddonation.app.mapper.GenericMapper;
import com.blooddonation.app.utils.BeanUtil;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class GenericRepository<ENTITY, DOMAIN, KEY> {

    private static final String LOG_CODE = "REPOSITORY";

    @PersistenceContext
    private EntityManager entityManager;

    private Class<DOMAIN> typeOfDomain;

    private Class<ENTITY> typeOfEntity;

    private Class<KEY> typeOfKeyEntity;

    //private Class<MAPPER> typeOfMapper;

    //Constructors

    //Unchecked
    public GenericRepository(){
        try{
            ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
            Type[] genericTypes = parameterizedType.getActualTypeArguments();

            this.typeOfEntity = (Class<ENTITY>) genericTypes[0];
            this.typeOfDomain = (Class<DOMAIN>) genericTypes[1];
            this.typeOfKeyEntity = (Class<KEY>) genericTypes[2];
            //this.typeOfMapper = (Class<MAPPER>) genericTypes[3];

        } catch(RuntimeException e){
            System.out.println(LOG_CODE + "[Erro Generic Repository" + e);
        }
    }

    //Monitorable
    @Transactional
    public ENTITY save(ENTITY entity){
        //ENTITY entity = (ENTITY) getMapper().toEntity(domain);
        getEntityManager().persist(entity);
        getEntityManager().flush();

        return entity;
    }

    //Monitorable
    @Transactional
    public List<ENTITY> saveList(List<ENTITY> entities){
        if (CollectionUtils.isEmpty(entities))
            return Collections.emptyList();
        
        //List<ENTITY> entities = (List<ENTITY>) getMapper().toModels(domains);
        entities.forEach(entity -> getEntityManager().persist(entity));
        getEntityManager().flush();
        
        return entities;

    }

    //Monitorable
    @Transactional
    public ENTITY update(ENTITY entity){
        //ENTITY entity = (ENTITY) getMapper().toEntity(domain);
        entity = getEntityManager().merge(entity);
        getEntityManager().flush();
        return entity;

    }

    //Monitorable
    @Transactional
    public Optional<ENTITY> findById(KEY id){
        ENTITY entity = getEntityManager().find(this.typeOfEntity, id);
        if(entity != null){
            return Optional.of(entity);
        }
        return Optional.empty();

    }

    //Monitorable
    @Transactional
    public Optional<ENTITY> findByCompositeKey(ENTITY key){
        //ENTITY entity = (ENTITY) getMapper().toEntity(key);
        ENTITY entity = getEntityManager().find(this.typeOfEntity, key);
        if(entity != null){
            return Optional.of(entity);
        }
        return Optional.empty();

    }

    //Monitorable
    @Transactional
    public void delete(KEY id){
        ENTITY entity = getEntityManager().find(this.typeOfEntity, id);
        getEntityManager().remove(entity);
    }

    //Monitorable
    //@Transactional
    public List<ENTITY> findAll(){
        List resultList = entityManager
                .createQuery("Select t from :entityName t")
                .setParameter("entityName", this.typeOfEntity.getSimpleName())
                .getResultList();
        if(resultList != null && !resultList.isEmpty()){
            return resultList;
        }
        return Collections.emptyList();
    }

    protected final EntityManager getEntityManager() {return this.entityManager;}

    protected final Class<DOMAIN> getTypeOfDomain() {return this.typeOfDomain;}

    protected final Class<ENTITY> getTypeOfEntity() {return this.typeOfEntity;}

    protected final Class<KEY> getTypeOfKeyEntity() {return this.typeOfKeyEntity;}

    //protected final GenericMapper getMapper() {return BeanUtil.getBean(typeOfMapper);}
}
