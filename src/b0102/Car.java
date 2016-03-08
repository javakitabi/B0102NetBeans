package b0102;

/**
 * Bu sınıf, bir araba soyutlamasının (abstraction) nasıl yapılacağını
 * anlatmaktadır. <code>Car</code> sınıfı, gerçek dünyadaki arabaya karşılık
 * gelmekte yani araba soyutlamasını ifade etmektedir. <code>Car</code> sınıfı
 * bir çok değiskene sahip olup, müşterilerine belli hizmetler sunmaktadır. Bu
 * cümleyi daha doğru bir şekilde, “<code>Car</code> sınıfından üretilen
 * nesnelerin bir durumu ve sorumlulukları vardır” şeklinde söyleyebiliriz.
 *
 *
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * Daha fazla bilgi için:
 * @see  <a href="http://www.javaturk.org" target="_blank">javaturk.org</a>
 *
 * @see <a href="http://www.javakitabi.com" target="_blank">javakitabi.com</a>
 */
public class Car {

    String make;
    String model;
    String year;
    int speed;
    int distance;

    /**
     * Arabanın kilometresini kendisine geçilen parametre kadar artırır.
     *
     * @param newDistance Arabanın katettiği yolun uzunluğudur.
     */
    public void go(int newDistance) {
        distance += newDistance;
    }

    /**
     * Arabanın hızında değişiklik yapmayı sağlar.
     *
     * @param newSpeed Arabanın yeni hızıdır.
     */
    public void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    /**
     * Arabanın durmasını sağlar.
     */
    public void stop() {
        speed = 0;
    }

    /**
     * Araba hakkında bilgi almaya yarar.
     *
     * @return Arabanın o anki güncel bilgisini verir.
     */
    public String getInfo() {
        return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and travelling at " + speed + " kmph.";
    }
}
