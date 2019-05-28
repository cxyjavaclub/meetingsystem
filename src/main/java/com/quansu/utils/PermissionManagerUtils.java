package com.quansu.utils;

import java.util.*;

/**
 * @author cxy
 * @date 2019/5/15
 * 权限管理器
 */
public class PermissionManagerUtils {
    /**
     * 权限管理类
     */
    public static class JurisdictionEntity {
        /**
         * 管理名称
         */
        private String name;
        /**
         * 当前管理下的操作全都允许
         */
        private boolean operationAll;

        /**
         * 当operationAll为false是查询允许操作
         */
        private List<String> operationList;

        public JurisdictionEntity() {
        }

        public JurisdictionEntity(String name) {
            this.name = name;
        }

        public JurisdictionEntity(String name, boolean operationAll) {
            this.name = name;
            this.operationAll = operationAll;
        }

        public JurisdictionEntity(String name, List<String> operationList) {
            this.name = name;
            this.operationList = operationList;
        }

        public JurisdictionEntity(String name, Boolean operationAll, List<String> operationList) {
            this.name = name;
            this.operationAll = operationAll;
            this.operationList = operationList;
        }

        public String getName() {
            return name;
        }

        public Boolean getOperationAll() {
            return operationAll;
        }

        public List<String> getOperationList() {
            return operationList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOperationAll(Boolean operationAll) {
            this.operationAll = operationAll;
        }

        public void setOperationList(List<String> operationList) {
            this.operationList = operationList;
        }

        @Override
        public String toString() {
            return "JurisdictionEntity{" +
                    "name='" + name + '\'' +
                    ", operationAll=" + operationAll +
                    ", operationList=" + operationList +
                    '}';
        }
    }

    /**
     * 权限管理集合
     */
    public static class JurisdictionList extends ArrayList<JurisdictionEntity> {

        /**
         * 设置是否权限全部通过，当此值为真时检查返回总是为真
         */
        private boolean allPass = false;

        public JurisdictionList() {
        }

        public JurisdictionList(JurisdictionEntity... entities) {
            addAll(Arrays.asList(entities));
        }

        /**
         * 设置
         * @param allPass
         */
        public void setAllPass(boolean allPass){
            this.allPass = allPass;
        }

        /**
         * 添加JurisdictionEntity
         *
         * @param entities
         * @return
         */
        public Integer setJurisdiction(JurisdictionEntity... entities) {
            addAll(Arrays.asList(entities));
            return entities.length;
        }

        /**
         * 添加JurisdictionEntity
         * @param entity
         * @return
         */
        public boolean addJurisdiction(JurisdictionEntity entity) {
            add(entity);
            return true;
        }

        /**
         * 通过权限名查询是否拥有该权限
         *
         * @param jurisdictionName
         * @param operationName
         * @return
         */
        public boolean ifFindNameJurisdictionEntity(String jurisdictionName, String operationName) {
            if(allPass){
                return true;
            }
            JurisdictionEntity entity = findNameJurisdictionEntity(jurisdictionName);
            return selectJurisdiction(entity, operationName);
        }

        /**
         * 通过权限名获取权限对象
         *
         * @param jurisdictionName
         * @return
         */
        public JurisdictionEntity findNameJurisdictionEntity(String jurisdictionName) {
            for (JurisdictionEntity entity : this) {
                if (entity.getName().equals(jurisdictionName)) {
                    return entity;
                }
            }
            return null;
        }

        /**
         * 检查权限对象里是否有此操作
         *
         * @param operationName
         * @return
         */
        public boolean selectJurisdiction(JurisdictionEntity entity, String operationName) {
            if(allPass){
                return true;
            }
            if (entity != null) {
                if (entity.getOperationAll()) {
                    return true;
                } else if(entity.getOperationList() != null){
                    for (String s : entity.getOperationList()) {
                        if (s.equals(operationName)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /**
         * 检查所有权限对象里是否有此操作记录
         *
         * @param operationName
         * @return
         */
        public Map<String, Boolean> selectJurisdictionMap(String operationName) {
            Map<String, Boolean> map = new HashMap<>();
            if(allPass){
                return map;
            }
            for (JurisdictionEntity entity : this) {
                map.put(entity.name, selectJurisdiction(entity, operationName));
            }
            return map;
        }

        /**
         * 检查是否有这个权限管理
         *
         * @param name
         * @return
         */
        public boolean ifNotJurisdiction(String name) {
            if(allPass){
                return true;
            }
            return (findNameJurisdictionEntity(name) == null) ? false : true;
        }

        /**
         * 获取所有的权限名称
         *
         * @return
         */
        public List<String> getAllJurisdictionListName() {
            List<String> list = new ArrayList<>();
            for (JurisdictionEntity entity : this) {
                list.add(entity.name);
            }
            return list;
        }
    }

    /**
     * 将格式化字符串转换为JurisdictionList(说明：当value为all时任何权限查询都为真)
     * @param value 进行转换为权限管理的字符串
     * @param setOperationAll  设置JurisdictionEntity的setOperationAll， 当为true时就没有operationList了
     * @param objDelimiter 每个权限管理分隔符 (默认,)
     * @param sonDelimiter 权限名称和子权限分隔符 (默认:)
     * @param listDelimiter 子权限字符串分隔符 (默认;)
     * @return
     */
    public static JurisdictionList findFormatCreate(String value, boolean setOperationAll, String objDelimiter, String sonDelimiter, String listDelimiter){
        if(value == null){
            return null;
        }
        String all = "all";
        JurisdictionList jurisdictionList = new JurisdictionList();
        if(all.toLowerCase().equals(value)){
            jurisdictionList.setAllPass(true);
        }else{
            String[] strings = value.trim().split(objDelimiter == null ? "," : objDelimiter);
            for(String s : strings){
                if(setOperationAll){
                    jurisdictionList.addJurisdiction(new JurisdictionEntity(s.trim(), true));
                }else{
                    String[] split = s.trim().split(sonDelimiter == null ? ":" : sonDelimiter);
                    if(split.length == 1){
                        jurisdictionList.addJurisdiction(new JurisdictionEntity(split[0].trim()));
                    }else  if(split.length == 2){
                        jurisdictionList.addJurisdiction(new JurisdictionEntity(split[0].trim(), Arrays.asList(split[1].split(listDelimiter == null ? ";" : listDelimiter))));
                    }
                }
            }
        }
        return jurisdictionList;
    }
}
