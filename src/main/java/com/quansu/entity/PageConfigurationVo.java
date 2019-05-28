package com.quansu.entity;

import java.util.List;

/**
 * @author cxy
 * @date 2019/5/20
 */
public class PageConfigurationVo {
    public class Two{
        private String toPage;
        private String catalogName;

        public Two(String toPage, String catalogName) {
            this.toPage = toPage;
            this.catalogName = catalogName;
        }

        public String getToPage() {
            return toPage;
        }

        public String getCatalogName() {
            return catalogName;
        }

        public void setToPage(String toPage) {
            this.toPage = toPage;
        }

        public void setCatalogName(String catalogName) {
            this.catalogName = catalogName;
        }
    }

    private String one;
    private String icon;
    private List<Two> two;

    public String getOne() {
        return one;
    }

    public String getIcon() {
        return icon;
    }

    public List<Two> getTwo() {
        return two;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setTwo(List<Two> two) {
        this.two = two;
    }

    public static Two getTwoObject(String toPage, String catalogName){
        return new PageConfigurationVo().new Two(toPage, catalogName);
    }

    public PageConfigurationVo() {
    }

    public PageConfigurationVo(String one, String icon, List<Two> two) {
        this.one = one;
        this.icon = icon;
        this.two = two;
    }

    public static PageConfigurationVo getOneObject(String one, String icon, List<Two> two){
        return new PageConfigurationVo(one, icon, two);
    }
}
