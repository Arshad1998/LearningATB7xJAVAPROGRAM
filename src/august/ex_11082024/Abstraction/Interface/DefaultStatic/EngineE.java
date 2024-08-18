package august.ex_11082024.Abstraction.Interface.DefaultStatic;

public interface EngineE {
    void startEngine();

    void stopEngine();

//    Interface cannot have a concrete class without any access modifiers like default and static
    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();
    void m3();

//    this will fail bcoz there os no static or default
//   void m4(){
//       System.out.println("Not possible");
//   }
}
