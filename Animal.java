public abstract class Animal{
  private int age;
  public Animal(){
    age = 0;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int a){
    age = a;
  }
  public abstract void eat();
  public abstract String bark();
}