import java.time.LocalDate;

public class Admin extends User{

    // TODO: Add method doSomething to print "Hello admin "+name+"!"
    // We need to use "getter method" instead of "field" as shown. Why is that?
    protected void doSomething() {
        System.out.println("Hello admin "+this.getName()+"!");
    }

    // TODO: Add method doSomething(int n) to print super.doSomething() n times.
    public void doSomething(int n) {
        for (int i = n; i > 0; i--) {
            super.doSomething();
        }
    }
          // TODO: Add method doExtra() to check if today equals Admin’s birthday
          // then display "Happy birthday admin!". Otherwise, do nothing.
        public void doExtra(){
            if(LocalDate.now().equals(this.getDob())){
                System.out.println("Happy Birthday Admin!");
            }
        }




}
