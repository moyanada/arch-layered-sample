package com.sample.layered.presentation.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sample.layered.domain.model.dto.code.CommonApiResultCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.ResponseEntity;

@Getter
@ToString
public class CommonApiResponse<T> {

    private final String resCd;

    private final String resMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("data")
    private final T data;

    private CommonApiResponse(String resCd, String resMsg, T data) {
        this.resCd = resCd;
        this.resMsg = resMsg;
        this.data = data;
    }

    public static <T> ResponseEntity<CommonApiResponse<T>> success(String trsNo, T data) {
        return ResponseEntity
                .status(CommonApiResultCode.SUCCESS.getHttpStatus())
                .body(
                        new CommonApiResponse<>(CommonApiResultCode.SUCCESS.getCode(), CommonApiResultCode.SUCCESS.getMessage(), data)
                );
    }

    public static <T> ResponseEntity<CommonApiResponse<T>> fail(String resCd, String resMsg) {
        return ResponseEntity
                .status(CommonApiResultCode.SUCCESS.getHttpStatus())
                .body(
                        new CommonApiResponse<>(resCd, resMsg, null)
                );
    }

    public String toStringResult() {
        return new StringBuilder()
                .append("CommonApiResponse{")
                    .append(", resCd='" + resCd)
                    .append(", resMsg='" + resMsg)
                .append("}").toString();
    }
}
