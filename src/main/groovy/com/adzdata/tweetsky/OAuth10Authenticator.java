package com.adzdata.tweetsky;

import org.pac4j.oauth.config.OAuth10Configuration;

public class OAuth10Authenticator extends org.pac4j.oauth.credentials.authenticator.OAuth10Authenticator {
    public OAuth10Authenticator(OAuth10Configuration configuration) {
        super(configuration);
    }
}
