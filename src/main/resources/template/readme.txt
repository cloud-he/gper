1、思考：模板模式除了继承以外，还有哪些实现方式？
answer:利用接口的默认实现

旅游模版接口：

public interface Trave {

    default void execute() {
        System.out.println("旅游开始了。。。");
        // 1、攻略
        pre();
        // 2、订票、订酒店
        post();
        // 3、旅游路线
        trave();
        // 4、回家
        goHome();
        System.out.println("旅游结束。。。");
    }

    void goHome();

    void trave();

    void post();

    void pre();
}
成都旅游

public class ChengDuTrave implements Trave {
    @Override
    public void goHome() {
        System.out.println("回家");
    }

    @Override
    public void trave() {
        System.out.println("九寨沟");
        System.out.println("熊猫");
    }

    @Override
    public void post() {
        System.out.println("订飞机票");
    }

    @Override
    public void pre() {
        System.out.println("百度一下");
    }
}
测试类：

public class TraveTest {

    public static void main(String[] args) {
        Trave trave = new ChengDuTrave();

        trave.execute();
    }
}