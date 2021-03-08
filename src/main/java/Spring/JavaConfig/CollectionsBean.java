package Spring.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsBean {

    // List With @Autowired
    @Autowired
    private List<String> nameList;
    private Set<String> nameSet;
    private Map<Integer, String> nameMap;

    // We can set the default value for an injected List property as an empty list by using the Collections.emptyList() static method:
    @Value("${names.list:}#{T(java.util.Collections).emptyList()}")
    private List<String> nameListWithDefaultValue;

    // Set With Constructor Injection
    public CollectionsBean(Set<String> strings) {
        this.nameSet = strings;
    }

    public void printNameList() {
        System.out.println(nameList);
    }

    public void printNameSet() {
        System.out.println(nameSet);
    }

    //Map With Setter Injection
    @Autowired
    public void setNameMap(Map<Integer, String> nameMap) {
        this.nameMap = nameMap;
    }

    public void printNameMap() {
        System.out.println(nameMap);
    }

    // inject bean references as elements of the collection
    // The Spring container injects the individual beans of the SimpleBean type into one collection.
    // We can use @Autowired(required = false) to mark the dependency as optional.
    // Instead of throwing an exception, the beanList won't be initialized and its value will stay null.
    @Autowired(required = false)
    @Qualifier("CollectionBean") // We can use the @Qualifier to select the beans to be injected into the specific collection that matches the @Qualifier name.
    private List<SimpleBean> beanList;

    public void printBeanList() {
        System.out.println(beanList.toString());
    }

    // We can set the default value for an injected List property as an empty list by using the Collections.emptyList() static method:
    public void printNameListWithDefaults() {
        System.out.println(nameListWithDefaultValue);
    }
}
