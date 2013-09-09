import org.fest.assertions.api.Assertions.assertThat
import org.junit.Test

class SortTest {
  val arr = Map(
    Array(2, 4, 6, 2, 6) -> Array(2, 2, 4, 6, 6),
    Array(199, 23, 5, 0, -7, 6, 9) -> Array(-7, 0, 5, 6, 9, 23, 199)
  )

  @Test
  def insertionSort() {
    for ((unsorted, sorted) <- arr) 
      assertThat(InsertionSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def selectionSort() {
    for ((unsorted, sorted) <- arr) 
      assertThat(SelectionSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def bubleSort() {
    for ((unsorted, sorted) <- arr) 
      assertThat(BubbleSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def mergeSort() {
    for ((unsorted, sorted) <- arr) 
      assertThat(MergeSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def quickSort() {
    for ((unsorted, sorted) <- arr) 
      assertThat(QuickSort(unsorted)).isEqualTo(sorted)
  }

  @Test
  def heapSort() {
    for ((unsorted, sorted) <- arr) 
      assertThat(HeapSort(unsorted)).isEqualTo(sorted)
  }
}
