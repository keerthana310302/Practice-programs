class A {
   public void display() {
      System.out.println("I am a student");
   }
}

class B {
   public void display() {
      System.out.println("I am a teacher");
   }
}

class Main {
   public static void main(String[] args) {
      B obj = new B();
      obj.display();
   }
}