import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.android.kotlincoroutines.main.MainViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainViewModelTest {

    /**
     * In this test, LiveData will immediately post values without switching threads.
     */
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var subject: MainViewModel

    /**
     * Before the test runs initialize subject
     */
    @Before
    fun setup() {
        subject = MainViewModel()
    }
}