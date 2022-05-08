package week1_assignment.week1_assignment.domain

import org.springframework.http.HttpStatus

data class BaseResponse<T>(
    val statusCode: Int,
    val success: Boolean,
    val data: T? = null,
    val message: String = ""

) {

    companion object {
        fun <T> success(data: T) = BaseResponse<T>(
            statusCode = HttpStatus.OK.value(),
            success = true,
            data = data,
            message = "success"

        )

        fun <T> failure(message: String) = BaseResponse<T>(
            statusCode = HttpStatus.EXPECTATION_FAILED.value(),
            success = false,
            message = "message"
        )
    }

}
