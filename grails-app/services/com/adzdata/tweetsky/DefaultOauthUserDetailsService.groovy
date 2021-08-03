package com.adzdata.tweetsky

import grails.gorm.transactions.Transactional
import grails.plugin.springsecurity.rest.oauth.OauthUser
import grails.plugin.springsecurity.rest.oauth.OauthUserDetailsService
import org.pac4j.core.profile.CommonProfile
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException

@Transactional
class DefaultOauthUserDetailsService implements OauthUserDetailsService{

    def serviceMethod() {

    }

    @Override
    OauthUser loadUserByUserProfile(CommonProfile userProfile, Collection<GrantedAuthority> defaultRoles) throws UsernameNotFoundException {
        return null
    }

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null
    }
}
