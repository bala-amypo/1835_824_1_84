// package com.example.demo.controller;

// import com.example.demo.security.JwtTokenProvider;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/auth")
// public class AuthController {

//     private final JwtTokenProvider jwtTokenProvider;

//     public AuthController(JwtTokenProvider jwtTokenProvider) {
//         this.jwtTokenProvider = jwtTokenProvider;
//     }

//     @PostMapping("/login")
//     public String login(@RequestParam String email,
//                         @RequestParam String role,
//                         @RequestParam Long userId) {
//         return jwtTokenProvider.generateToken(email, role, userId);
//     }
// }

package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtTokenProvider jwtTokenProvider;
    private final UserService userService;

    public AuthController(JwtTokenProvider jwtTokenProvider, UserService userService) {
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    // ✅ REGISTER
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.save(user);
    }

    // ✅ LOGIN (already correct)
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String role,
                        @RequestParam Long userId) {
        return jwtTokenProvider.generateToken(email, role, userId);
    }
}
