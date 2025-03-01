package com.example.tools;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tools")
public class ToolController {

    @PostMapping("/content-creation")
    public ResponseEntity<String> contentCreation(@RequestBody String prompt) {
        String result = "Generated content based on prompt: " + prompt;
        return ResponseEntity.ok(result);
    }

    @PostMapping("/nlp-tools")
    public ResponseEntity<String> nlpTools(@RequestBody String text) {
        String result = "Processed text: " + text;
        return ResponseEntity.ok(result);
    }

    // Define other tool endpoints as needed
}
