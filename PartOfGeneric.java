class PartOfGeneric {
//일반 클래스 내부 제네릭 메소드 선언
    public <T> T accept(T t) {
        return t;
    }

    public <K, V> void getPrint(K k, V v) { //리턴 타입 앞에 타입 매개변수 선언
        System.out.println(k + ":" + v);
    }
}

