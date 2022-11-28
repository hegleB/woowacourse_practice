package racingcar.utils

enum class ErrorType(val errorMessage: String) {
    NAME_RANGE(ERROR.format(CAR_NAME + ERROR_NAME_RANGE)),
    NAME_PATTERN(ERROR.format(CAR_NAME + ERROR_NAME_PATTERN)),
    TRY_POSITIVE_NUMBER(ERROR.format(TRY_NUMBER + ERROR_TRY_POSITIVE_NUMBER))
}