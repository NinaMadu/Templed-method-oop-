public abstract class CaffineBeverage {
    final void prepareRecipe() {
        boilwater();
        brew();
        prounCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    void boilwater(){
        System.out.println("Boiling water");
    }
    void prounCup(){
        System.out.println("“Pouring into cup");
    }
}
