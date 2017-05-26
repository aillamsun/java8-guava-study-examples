# java8-guava-study-examples
java8-guava-study-examples

### Collections

#### Guava
> * BiMapTest
> * CollectionTest
> * IterablesTest
> * ListsTest
> * MapsTest
> * MultimapsTest
> * MultisetsTest
> * QueuesTest
> * SetsTest
> * SortedSetTest
> * TablesTest
#### Java8

-----

### String 

```java
 @Test
    public void string(){

        List names=new ArrayList<String>();
        names.add("1");
        names.add("2");
        names.add("3");

        System.out.println(String.join(",", names));


        String[] arrStr=new String[]{"a","b","c"};
        System.out.println(String.join(",", arrStr));

    }
```

```java
  @Test
    public void strings() {
        // Guava
        String s = getString();
        Strings.isNullOrEmpty(s);
        Strings.nullToEmpty(s);
        Strings.repeat("-", 70);

        List<String> parts = Arrays.asList("a", "b", "c", null);
        String joined = Joiner.on(", ").skipNulls().join(parts);
        assertThat(joined, is("a, b, c"));

        Splitter.MapSplitter splitter = Splitter.on(" ").withKeyValueSeparator(":");
        splitter.split("a:1 b:2"); // => Map {a=1, b=2}
    }


    private String getString() {
        return "";
    }
```


