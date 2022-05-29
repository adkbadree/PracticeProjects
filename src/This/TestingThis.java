package This;

public class TestingThis {

    int a;
    int b;

    public void setData(int a, int b){

        this.a=a;
        this.b=b;
    }

    public static void main(String[] args) {

        TestingThis testingthis = new TestingThis();

        testingthis.setData(4,5);

        System.out.println(testingthis.a+ testingthis.b);



    }
}
