package eslam.emad.kotlinsealedclassesexample

import com.google.common.truth.Truth.assertThat
import eslam.emad.kotlinsealedclassesexample.Util.takesBooleanReturnsResult
import eslam.emad.kotlinsealedclassesexample.Util.takesResultReturnsBoolean
import org.junit.Test

class UtilTest{

    @Test
    fun `takesBooleanReturnsResult() with true then return Success`(){
       val result = takesBooleanReturnsResult(true)

        assertThat(result is Result.Success).isTrue()
    }

    @Test
    fun `takesBooleanReturnsResult() with true then return correct`(){
        val result = takesBooleanReturnsResult(true)

        assertThat(result.message).isEqualTo("correct")
    }

    @Test
    fun `takesBooleanReturnsResult() with false then return Error`(){
        val result = takesBooleanReturnsResult(false)

        assertThat(result is Result.Error).isTrue()
    }

    @Test
    fun `takesBooleanReturnsResult() with false then return wrong`(){
        val result = takesBooleanReturnsResult(false)

        assertThat(result.message).isEqualTo("wrong")
    }

    @Test
    fun `takesResultReturnsBoolean() with Success then return true`(){
        val result = takesResultReturnsBoolean(Result.Success())

        assertThat(result).isTrue()
    }

    @Test
    fun `takesResultReturnsBoolean() with Error then return false`(){
        val result = takesResultReturnsBoolean(Result.Error())

        assertThat(result).isFalse()
    }
}