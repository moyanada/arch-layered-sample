package com.sample.layered.presentation;

import com.sample.layered.presentation.response.CommonApiResponse;
import com.sample.layered.presentation.response.MemberInfoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("member/{memberId}")
    public ResponseEntity<CommonApiResponse<MemberInfoResponse>> getMember(
            @PathVariable String memberId
    ) {

    }
}
