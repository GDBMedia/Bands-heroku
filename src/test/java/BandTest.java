import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BandTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void Band_instantiatesCorrectly_true() {
    String[] array = {"1", "3"};
    Band myBand = new Band("twenty one pilots", "a band", "bad", array);
    assertEquals(true, myBand instanceof Band);
  }

  @Test
  public void getName_BandInstantiatesWithName_String() {
    Band myBand = new Band("twenty one pilots", "a band", "bad", array);
    assertEquals("twenty one pilots", myBand.getName());
  }

  // @Test
  // public void all_emptyAtFirst_0() {
  //   assertEquals(0, Band.all().size());
  // }
  //
  // @Test
  // public void equals_returnsTrueIfNamesAretheSame_true() {
  //   Band firstBand = new Band("Household chores");
  //   Band secondBand = new Band("Household chores");
  //   assertTrue(firstBand.equals(secondBand));
  // }
  //
  // @Test
  // public void save_savesObjectIntoDatabase_true() {
  //   Band myBand = new Band("Household chores");
  //   myBand.save();
  //   assertTrue(Band.all().get(0).equals(myBand));
  // }
  //
  // @Test
  // public void save_assignsIdToObject_int() {
  //   Band myBand = new Band("Household chores");
  //   myBand.save();
  //   Band savedBand = Band.all().get(0);
  //   assertEquals(myBand.getId(), savedBand.getId());
  // }
  //
  // @Test
  // public void find_findBandInDatabase_true() {
  //   Band myBand = new Band("Household chores");
  //   myBand.save();
  //   Band savedBand = Band.find(myBand.getId());
  //   assertTrue(myBand.equals(savedBand));
  // }
  //
  // @Test
  // public void addTask_addsTaskToBand_true() {
  //   Band myBand = new Band("Household chores");
  //   myBand.save();
  //   Task myTask = new Task("Mow the lawn", "2016-05-14");
  //   myTask.save();
  //   myBand.addTask(myTask);
  //   Task savedTask = myBand.getTasks().get(0);
  //   assertTrue(myTask.equals(savedTask));
  // }
  //
  // @Test
  // public void getTasks_returnsAllTasks_List() {
  //   Band myBand = new Band("Household chores");
  //   myBand.save();
  //   Task myTask = new Task("Mow the lawn", "2016-05-14");
  //   myTask.save();
  //   myBand.addTask(myTask);
  //   List savedTasks = myBand.getTasks();
  //   assertEquals(1, savedTasks.size());
  // }
  //
  // @Test
  // public void delete_deletesAllTasksAndCategoriesAssociations() {
  //   Band myBand = new Band("Household chores");
  //   myBand.save();
  //   Task myTask = new Task("Mow the lawn", "2016-05-14");
  //   myTask.save();
  //   myBand.addTask(myTask);
  //   myBand.delete();
  //   assertEquals(0, myTask.getCategories().size());
  // }

}