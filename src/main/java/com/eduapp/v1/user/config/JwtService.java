package com.eduapp.v1.user.config;

import java.security.Key;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService{

    private final static String SECRET_KEY = "Xntulgab9sy6gQ1OXWxovKkJSmqmdSwp";

    // Upublic String extractionEmailFromtJwtToken(String jwtToken){
    //     return null;
    // }


    // private Claims extractAllClaims(String token){
    //     return Jwts
    //         .parser()
    //         .setSigningKey(getSiningKey())
    //         .build()
    //         .parseClaimsJws(token)
    //         .getBody();

    // }

    // private  Key getSiningKey(){
    //     byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
    //     return Keys.hmacShaKeyFor(keyBytes);
    // }
}
