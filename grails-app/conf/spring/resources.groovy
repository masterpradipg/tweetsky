import com.adzdata.tweetsky.JwtCookieTokenReader

//import org.pac4j.oauth.credentials.authenticator.OAuth10Authenticator
import org.springframework.security.web.authentication.logout.CookieClearingLogoutHandler

// Place your Spring DSL code here
beans = {
    tokenReader(JwtCookieTokenReader) {
        cookieName = 'jwt'
    }


    cookieClearingLogoutHandler(CookieClearingLogoutHandler, ['jwt'])

//    oAuth10Authenticator(OAuth10Authenticator){
//        details='jwt'
//
//    }

}
