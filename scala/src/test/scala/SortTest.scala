import org.fest.assertions.api.Assertions.assertThat
import org.junit.Test

class SortTest {
  val arr = Map(
    Array(2, 4, 6, 2, 6) -> Array(2, 2, 4, 6, 6),
    Array(199, 23, 5, 0, -7, 6, 9) -> Array(-7, 0, 5, 6, 9, 23, 199)
  )

  @Test
  def insertionSort(): Unit = {
    for ((unsorted, sorted) <- arr) 
      assertThat(InsertionSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def selectionSort(): Unit = {
    for ((unsorted, sorted) <- arr) 
      assertThat(SelectionSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def bubleSort(): Unit = {
    for ((unsorted, sorted) <- arr) 
      assertThat(BubbleSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def mergeSort(): Unit = {
    for ((unsorted, sorted) <- arr) 
      assertThat(MergeSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def quickSort(): Unit = {
    for ((unsorted, sorted) <- arr) 
      assertThat(QuickSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def heapSort(): Unit = {
    for ((unsorted, sorted) <- arr) 
      assertThat(HeapSort(unsorted)).isEqualTo(sorted)
  }
}
