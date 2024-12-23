package com.demo.transaction.controller.command;

import com.demo.transaction.dto.TransactionRequestDto;
import com.demo.transaction.service.impl.TransactionCommandServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/transactions")
//for WRITE controller
@ConditionalOnProperty(name = "app.write.enabled", havingValue = "true")
public class TransactionCommandController {

    private final TransactionCommandServiceImpl transactionCommandService;

    @PostMapping
    public void createTransaction(@RequestBody TransactionRequestDto request) {
        transactionCommandService.createTransaction(request);
    }

}
/**
 *
 * The HstsHeaderWriter class and sets the
 * includeSubDomains property to true. This means that the HSTS header will include the
 * "includeSubDomains" directive, which instructs browsers to also apply the HSTS policy to any
 * subdomains of the current domain.
 * <p>
 * The HstsHeaderWriter class is part of the Spring Security library and can be used to easily add
 * the HTTP Strict Transport Security (HSTS) header to the response. HSTS is a security mechanism
 * that helps protect websites from being hijacked by forcing browsers to only communicate with
 * the website over HTTPS. By including the "includeSubDomains" directive, HSTS will also apply to
 * any subdomains of the current domain, ensuring that all assets on the website are loaded over a
 * secure connection.
 * <p>
 * In this case, the HstsHeaderWriter is being used to set the HSTS header on all responses sent
 * by the Spring Boot application. This can be done by adding the HeaderWriter to the
 * http.headers() method in the SecurityConfig class.
 *
 * @return HeaderWriter
 */