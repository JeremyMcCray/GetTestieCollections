public class LamdaPractice {

   static TripleInterface t = (i) -> (Integer) i*3;

    public static void main(String[] args) {
        System.out.println(t.TripleThis((6)));
    }
}






interface TripleInterface<T>{

    T TripleThis(T i);
}
