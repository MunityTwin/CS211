/** Example of using unit tests for this assignment.  To run them on the command line, make
 * sure that the junit-cs211.jar is in the same directory.
 *
 * On Mac/Linux:
 *  javac -cp .:junit-cs211.jar *.java         # compile everything
 *  java -cp .:junit-cs211.jar P2Tester        # run tests
 *
 * On windows replace colons with semicolons: (: with ;)
 *  demo$ javac -cp .;junit-cs211.jar *.java   # compile everything
 *  demo$ java -cp .;junit-cs211.jar P2Tester  # run tests
 */
import org.junit.*;
import static org.junit.Assert.*;

public class P2Tester {
  public static void main(String args[]){
    org.junit.runner.JUnitCore.main("P2Tester");
  }
  // ***** class Fruit tests **********************************

  @Test(timeout=1000) public void test_fruit0(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
  }
  @Test(timeout=1000) public void test_fruit1(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    assertEquals("Setting ppu from Fruit constructor, incorrect getPricePerUnit()", 1.0, f.getPricePerUnit(), 0.0001);
  }
  @Test(timeout=1000) public void test_fruit2(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    assertEquals("Setting stock from Fruit constructor, incorrect getStock()", 1, f.getStock());
  }
  @Test(timeout=1000) public void test_fruit3(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    assertEquals("Setting freshUntil from Fruit constructor, incorrect getFreshUntil()", 1, f.getFreshUntil());
  }
  @Test(timeout=1000) public void test_fruit4(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    int setTo = 100;
    f.setStock(setTo);
    int rv = f.getStock();
    assertEquals("stock getter/setter, incorrect getStock()", setTo, rv);
  }
  @Test(timeout=1000) public void test_fruit5(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    int setTo = 100;
    f.setFreshUntil(setTo);
    int rv = f.getFreshUntil();
    assertEquals("freshUntil getter/setter, incorrect getStock()", setTo, rv);
  }
  @Test(timeout=1000) public void test_fruit6(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    String expectedRv = "pounds";
    String actualRv = f.getUnits();
    assertEquals("incorrect getUnits()", expectedRv, actualRv);
  }
  @Test(timeout=1000) public void test_fruit7(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    String expectedRv = "Fruit";
    String actualRv = f.name();
    assertEquals("incorrect name()", expectedRv, actualRv);
  }
  @Test(timeout=1000) public void test_fruit8(){
    Fruit f;
    f = new Fruit(1.0, 1, 1);
    String expectedRv = "[Fruit: pricePerUnit=1.0, stock=1, freshUntil=1, units=pounds]";
    String actualRv = f.toString();
    assertEquals("incorrect Fruit.toString()", expectedRv, actualRv);
  }

  // ***** class FruitWarehouse tests **********************************
  @Test(timeout=1000) public void test_fruitwarehouse0(){
    assertEquals("incorrect FruitWarehouse.BULK_RATE",0.8,FruitWarehouse.BULK_RATE, 0.0001);
  }
  @Test(timeout=1000) public void test_fruitwarehouse1(){
    assertEquals("incorrect FruitWarehouse.bananaPricePerUnit", 10.0, FruitWarehouse.bananaPricePerUnit, 0.0001);
  }
  @Test(timeout=1000) public void test_fruitwarehouse2(){
    assertEquals("incorrect FruitWarehouse.pineapplePricePerUnit", 3.0, FruitWarehouse.pineapplePricePerUnit, 0.0001);
  }
  @Test(timeout=1000) public void test_fruitwarehouse3(){
    assertEquals("incorrect FruitWarehouse.watermelonPricePerUnit", 0.34, FruitWarehouse.watermelonPricePerUnit, 0.0001);
  }
  @Test(timeout=1000) public void test_fruitwarehouse4(){
    assertEquals("incorrect FruitWarehouse.BANANA_FRESH_DAYS", 7, FruitWarehouse.BANANA_FRESH_DAYS);
  }
  @Test(timeout=1000) public void test_fruitwarehouse5(){
    assertEquals("incorrect FruitWarehouse.PINEAPPLE_FRESH_DAYS", 3, FruitWarehouse.PINEAPPLE_FRESH_DAYS);
  }
  @Test(timeout=1000) public void test_fruitwarehouse6(){
    assertEquals("incorrect FruitWarehouse.WATERMELON_FRESH_DAYS", 10, FruitWarehouse.WATERMELON_FRESH_DAYS);
  }
  // ***** class Banana tests **********************************
  @Test(timeout=1000) public void test_banana0(){
    int bananaStock = 2;
    Banana b = new Banana(bananaStock);
    assertTrue("Banana should be a subclass of Fruit", b instanceof Fruit);
    assertEquals("incorrect Banana constructor, should set stock", bananaStock, b.getStock());
    assertEquals("incorrect Banana constructor, should set pricePerUnit from FruitWarehouse", FruitWarehouse.bananaPricePerUnit, b.getPricePerUnit(), 0.0001);
    assertEquals("incorrect Banana constructor, should set freshUntil from FruitWarehouse", FruitWarehouse.BANANA_FRESH_DAYS, b.getFreshUntil());
  }
  @Test(timeout=1000) public void test_banana1(){
    int bananaStock = 2;
    Banana b = new Banana(bananaStock);
    assertEquals("incorrect Banana.name()", "Banana", b.name());
  }
  @Test(timeout=1000) public void test_banana2(){
    int bananaStock = 2;
    Banana b = new Banana(bananaStock);
    assertEquals("incorrect Banana.getUnits()", "bunch", b.getUnits());
  }
  // ***** class Pineapple tests **********************************
  @Test(timeout=1000) public void test_pineapple0(){
    int pineappleStock = 3;
    Pineapple p = new Pineapple(pineappleStock);
    assertTrue("Pineapple should be a subclass of Fruit", p instanceof Fruit);
    assertEquals("incorrect Pineapple constructor, should set stock", pineappleStock, p.getStock());
    assertEquals("incorrect Pineapple constructor, should set pricePerUnit from FruitWarehouse", FruitWarehouse.pineapplePricePerUnit, p.getPricePerUnit(), 0.0001);
    assertEquals("incorrect Pineapple constructor, should set freshUntil from FruitWarehouse", FruitWarehouse.PINEAPPLE_FRESH_DAYS, p.getFreshUntil());
  }
  @Test(timeout=1000) public void test_pineapple1(){
    Pineapple p = new Pineapple(3);
    assertEquals("incorrect Pineapple.name()", "Pineapple", p.name());
  }
  @Test(timeout=1000) public void test_pineapple2(){
    Pineapple p = new Pineapple(3);
    assertEquals("incorrect Pineapple.getUnits()", "item", p.getUnits());
  }
  // ***** class Watermelon tests **********************************
  @Test(timeout=1000) public void test_watermelon0(){
    int watermelonStock = 4;
    Watermelon w = new Watermelon(watermelonStock);
    assertTrue("Watermelon should be a subclass of Fruit", w instanceof Fruit);
    assertEquals("incorrect Watermelon constructor, should set stock", watermelonStock, w.getStock());
    assertEquals("incorrect Watermelon constructor, should set pricePerUnit from FruitWarehouse", FruitWarehouse.watermelonPricePerUnit, w.getPricePerUnit(), 0.0001);
    assertEquals("incorrect Watermelon constructor, should set freshUntil from FruitWarehouse", FruitWarehouse.WATERMELON_FRESH_DAYS, w.getFreshUntil());
  }
  @Test(timeout=1000) public void test_watermelon1(){
    Watermelon w = new Watermelon(4);
    assertEquals("incorrect Watermelon.name()", "Watermelon", w.name());
  }
  @Test(timeout=1000) public void test_watermelon2(){
    Watermelon w = new Watermelon(4);
    assertEquals("incorrect Watermelon.getUnits()", "pounds", w.getUnits());
  }
  // ***** class FruitStand tests **********************************
  @Test(timeout=1000) public void test_fruitstand0(){
    FruitStand fs = new FruitStand(); //check constructor
  }
  @Test(timeout=1000) public void test_fruitstand1(){
    FruitStand fs = new FruitStand();
    Fruit[] fruitArray = new Fruit[1];
    fruitArray[0] = new Fruit(5.0, 6, 7);
    fs.setAvailableFruit(fruitArray);
    assertArrayEquals("FruitStand availableFruit[] getter/setter should get/set the same array", fruitArray, fs.getAvailableFruit());
  }
  @Test(timeout=1000) public void test_fruitstand2(){
    FruitStand fs = new FruitStand();
    double cashIn = 8.0;
    fs.setCash(cashIn);
    assertEquals("FruitStand cash getter/setter should get/set same value", cashIn, fs.getCash(), 0.0001);
  }
  public void checkFruitStand(Fruit[] farr, String n, int orderAmt, double cashAfter, int orderRemaining, int fIdx, int stockAfter){
    FruitStand fs = new FruitStand();
    fs.setAvailableFruit(farr);
    fs.setCash(0);
    int rv = fs.sellFruit(n,orderAmt);
    assertEquals("FruitStand.sellFruit() incorrect cash after sale", cashAfter, fs.getCash(), 0.0001);
    assertEquals("FruitStand.sellFruit() incorrect return value", orderRemaining, rv);
    Fruit[] gaf = fs.getAvailableFruit();
    Fruit fruitCheck = gaf[fIdx];
    assertEquals("FruitStand.sellFruit() incorrect stock after sale", stockAfter, fruitCheck.getStock());
  }
  @Test(timeout=1000) public void test_fruitstand3(){
    Fruit[] fruitArray = new Fruit[1];
    fruitArray[0] = new Fruit(1.0, 1, 1);
    checkFruitStand(fruitArray,"Fruit",1,1.0,0,0,0);
  }
  @Test(timeout=1000) public void test_fruitstand4(){
    Fruit[] fruitArray = new Fruit[1];
    fruitArray[0] = new Fruit(1.0, 1, 1);
    checkFruitStand(fruitArray,"Fruit",2,1.0,1,0,0);
  }
  @Test(timeout=1000) public void test_fruitstand5(){
    Fruit[] fruitArray = new Fruit[1];
    fruitArray[0] = new Fruit(1.0,3,1);
    checkFruitStand(fruitArray, "Fruit", 2, 2.0, 0, 0, 1);
  }
  @Test(timeout=1000) public void test_fruitstand6(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Fruit(1.0,3,1);
    fruitArray[1] = new Fruit(1.0,2,1);
    checkFruitStand(fruitArray, "Fruit", 3, 3.0, 0, 0, 0);
  }
  @Test(timeout=1000) public void test_fruitstand7(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Fruit(1.0,3,1);
    fruitArray[1] = new Fruit(1.0,2,1);
    checkFruitStand(fruitArray, "Fruit", 3, 3.0, 0, 1, 2);
  }
  @Test(timeout=1000) public void test_fruitstand8(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Fruit(1.0,3,1);
    fruitArray[1] = new Fruit(1.0,2,1);
    checkFruitStand(fruitArray, "Fruit", 4, 4.0, 0, 1, 1);
  }
  @Test(timeout=1000) public void test_fruitstand9(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Fruit(1.0,3,1);
    fruitArray[1] = new Fruit(1.0,2,1);
    checkFruitStand(fruitArray, "Fruit", 10, 5.0, 5, 1, 0);
  }
  @Test(timeout=1000) public void test_fruitstand10(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Watermelon(3);
    fruitArray[1] = new Banana(2);
    checkFruitStand(fruitArray, "Banana", 10, 20.0, 8, 1, 0);
  }
  public void checkRestock(Fruit[] farr, int[] units, double cashBefore, double restockCost){
    FruitStand fs = new FruitStand();
    fs.setAvailableFruit(farr);
    fs.setCash(cashBefore);
    double rv = fs.restock(units);
    assertEquals("incorrect FruitStand.restock(), cash after should be zero", 0.0, fs.getCash(), 0.0001);
    assertEquals("incorrect FruitStand.restock(), return value", restockCost, rv, 0.0001);
    Fruit[] gaf = fs.getAvailableFruit();
    assertEquals("availableFruit.length does not match after restock()", gaf.length, farr.length);
    for(int i=0;i<gaf.length;i++){
      assertEquals("incorrect FruitStand restock(), availableFruit["+i+"].getStock() not correct after restock", units[i], gaf[i].getStock());
    }
  }
  @Test(timeout=1000) public void test_fruitstand11(){
    Fruit[] fruitArray = new Fruit[1];
    fruitArray[0] = new Fruit(1.0, 1, 1);
    int[] units = {1};
    checkRestock(fruitArray,units,1.0,0.0);
  }
  @Test(timeout=1000) public void test_fruitstand12(){
    Fruit[] fruitArray = new Fruit[1];
    fruitArray[0] = new Fruit(1.0, 1, 1);
    int[] units = {2};
    checkRestock(fruitArray,units,1.0,0.8);
  }
  @Test(timeout=1000) public void test_fruitstand13(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Fruit(1.0, 1, 1);
    fruitArray[1] = new Fruit(2.0, 2, 1);
    int[] units = {2,3};
    checkRestock(fruitArray,units,1.0,2.4);
  }
  @Test(timeout=1000) public void test_fruitstand14(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Watermelon(2);
    fruitArray[1] = new Banana(3);
    int[] units = {3,4};
    checkRestock(fruitArray,units,1.0,8.272);
  }
  @Test(timeout=1000) public void test_fruitstand15(){
    Fruit[] fruitArray = new Fruit[2];
    fruitArray[0] = new Fruit(1.0, 1, 0);
    fruitArray[1] = new Fruit(1.0, 2, 0);
    int[] units = {2,3};
    checkRestock(fruitArray,units,1.0,4.0);
  }
  // ***** class FruitEmporium tests **********************************
  @Test(timeout=1000) public void test_fruitemporium0(){
    FruitStand[] stands = new FruitStand[1];
    stands[0] = new FruitStand();
    FruitEmporium fe = new FruitEmporium(stands);
    assertArrayEquals("FruitEmporium constructor, getStands() not matching", stands, fe.getStands());
  }
  @Test(timeout=1000) public void test_fruitemporium1(){
    FruitStand[] stands = new FruitStand[1];
    stands[0] = new FruitStand();
    stands[0].setCash(10.0);
    FruitStand[] newStands = new FruitStand[1];
    newStands[0] = new FruitStand();
    newStands[0].setCash(7.0);
    FruitEmporium fe = new FruitEmporium(stands);
    fe.setStands(newStands);
    assertArrayEquals("FruitEmporium stands getter/setter not matching", newStands, fe.getStands());
  }
  @Test(timeout=1000) public void test_fruitemporium2(){
    FruitStand[] stands = new FruitStand[10];
    double expectedCash = 0.0;
    for(int i=0;i<stands.length;i++){
      stands[i] = new FruitStand();
      stands[i].setCash(i+1);
      expectedCash += (i+1);
    }
    FruitEmporium fe = new FruitEmporium(stands);
    assertEquals("FruitEmporium.totalCash() incorrect",expectedCash,fe.totalCash(),0.0001);
  }
  @Test(timeout=1000) public void test_fruitemporium3(){
    FruitStand[] stands = new FruitStand[1];
    stands[0] = new FruitStand();
    Fruit[] fa = new Fruit[1];
    fa[0] = new Banana(1);
    stands[0].setAvailableFruit(fa);
    FruitEmporium fe = new FruitEmporium(stands);
    double rv = fe.restockAllStands(11);
    assertEquals("FruitEmporium.restockAllStands() incorrect return value", 80.0, rv, 0.0001);
    assertEquals("FruitEmporium cash after restock incorrect", 0.0, fe.totalCash(), 0.0001);
  }
  @Test(timeout=1000) public void test_fruitemporium4(){
    FruitStand[] stands = new FruitStand[2];
    stands[0] = new FruitStand();
    Fruit[] fa = new Fruit[2];
    fa[0] = new Banana(1);
    fa[1] = new Watermelon(2);
    stands[0].setAvailableFruit(fa);
    stands[1] = new FruitStand();
    fa = new Fruit[2];
    fa[0] = new Pineapple(3);
    fa[1] = new Fruit(4.0, 5, 6);
    stands[1].setAvailableFruit(fa);
    FruitEmporium fe = new FruitEmporium(stands);
    double rv = fe.restockAllStands(1);
    assertEquals("FruitEmporium.restockAllStands() incorrect return value", 0.0, rv, 0.0001);
    assertEquals("FruitEmporium cash after restock incorrect", 0.0, fe.totalCash(), 0.0001);
  }
  @Test(timeout=1000) public void test_fruitemporium5(){
    FruitStand[] stands = new FruitStand[2];
    stands[0] = new FruitStand();
    Fruit[] fa = new Fruit[2];
    fa[0] = new Banana(1);
    fa[1] = new Watermelon(2);
    stands[0].setAvailableFruit(fa);
    stands[1] = new FruitStand();
    fa = new Fruit[2];
    fa[0] = new Pineapple(3);
    fa[1] = new Fruit(4.0, 5, 6);
    stands[1].setAvailableFruit(fa);
    FruitEmporium fe = new FruitEmporium(stands);
    double rv = fe.restockAllStands(3);
    assertEquals("FruitEmporium.restockAllStands() incorrect return value", 16.272, rv, 0.0001);
    assertEquals("FruitEmporium.restockAllStands() incorrect stock after restock", 3, fe.getStands()[0].getAvailableFruit()[0].getStock());
    assertEquals("FruitEmporium.restockAllStands() incorrect stock after restock", 3, fe.getStands()[0].getAvailableFruit()[1].getStock());
    assertEquals("FruitEmporium cash after restock incorrect", 0.0, fe.totalCash(), 0.0001);     
  }
  @Test(timeout=1000) public void test_fruitemporium6(){
    double bananaPPU = FruitWarehouse.bananaPricePerUnit;
    FruitWarehouse.bananaPricePerUnit = 1.0;
    double pineapplePPU = FruitWarehouse.pineapplePricePerUnit;
    FruitWarehouse.pineapplePricePerUnit = 1.0;
    double watermelonPPU = FruitWarehouse.watermelonPricePerUnit;
    FruitWarehouse.watermelonPricePerUnit = 1.0;
    FruitStand[] stands = new FruitStand[2];
    stands[0] = new FruitStand();
    Fruit[] fa = new Fruit[2];
    fa[0] = new Banana(1); // 5, 5
    fa[1] = new Watermelon(2); // 4, 9
    stands[0].setAvailableFruit(fa);
    stands[1] = new FruitStand();
    fa = new Fruit[2];
    fa[0] = new Pineapple(3); // 3, 12
    fa[1] = new Fruit(1.0, 5, 6); // 1, 13
    stands[1].setAvailableFruit(fa);
    FruitEmporium fe = new FruitEmporium(stands);
    double rv = fe.restockAllStands(6);
    FruitWarehouse.bananaPricePerUnit = bananaPPU;
    FruitWarehouse.pineapplePricePerUnit = pineapplePPU;
    FruitWarehouse.watermelonPricePerUnit = watermelonPPU;
    assertEquals("FruitEmporium.restockAllStands() incorrect return value", 10.4, rv, 0.0001); //13.0*0.8 == 10.4
    assertEquals("FruitEmporium.restockAllStands() incorrect stock after restock", 6, fe.getStands()[0].getAvailableFruit()[0].getStock());
    assertEquals("FruitEmporium.restockAllStands() incorrect stock after restock", 6, fe.getStands()[0].getAvailableFruit()[1].getStock());
    assertEquals("FruitEmporium.restockAllStands() incorrect stock after restock", 6, fe.getStands()[1].getAvailableFruit()[0].getStock());
    assertEquals("FruitEmporium.restockAllStands() incorrect stock after restock", 6, fe.getStands()[1].getAvailableFruit()[1].getStock());
    assertEquals("FruitEmporium cash after restock incorrect", 0.0, fe.totalCash(), 0.0001);
  }
  @Test(timeout=1000) public void test_fruitemporium7(){
    FruitStand[] stands = new FruitStand[3];
    stands[0] = new FruitStand();
    Fruit[] fa = new Fruit[3];
    fa[0] = new Banana(10);
    fa[1] = new Pineapple(2);
    fa[2] = new Watermelon(7);
    stands[0].setAvailableFruit(fa);
    stands[0].setCash(0);
    stands[1] = new FruitStand();
    fa = new Fruit[1];
    fa[0] = new Banana(2);
    stands[1].setAvailableFruit(fa);
    stands[2] = new FruitStand();
    fa = new Fruit[1];
    fa[0] = new Pineapple(3);
    stands[2].setAvailableFruit(fa);
    FruitEmporium fe = new FruitEmporium(stands);
    int rv = fe.sellFruit("Fruit",10);
    assertEquals("FruitEmporium.sellFruit() incorrect return value", 10, rv);
    rv = fe.sellFruit("Banana", 1);
    assertEquals("FruitEmporium.sellFruit() incorrect return value", 0, rv);
    assertEquals("FruitEmporium.sellFruit() incorrect cash after sale", 10.0, fe.totalCash(), 0.0001);
    rv = fe.sellFruit("Pineapple", 4);
    assertEquals("FruitEmporium.sellFruit() incorrect return value", 0, rv);
    assertEquals("FruitEmporium.sellFruit() incorrect cash after sale", 22.0, fe.totalCash(), 0.0001);
    rv = fe.sellFruit("Banana", 15);
    assertEquals("FruitEmporium.sellFruit() incorrect return value", 4, rv);
    assertEquals("FruitEmporium.sellFruit() incorrect cashAfterSale", 132.0, fe.totalCash(), 0.0001);
  }

}
