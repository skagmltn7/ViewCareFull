package com.ssafy.ViewCareFull.domain.users.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OauthTokenResponse {

  @JsonProperty("access_token")
  private String accessToken;

  private String scope;

  @JsonProperty("token_type")
  private String tokenType;

}
