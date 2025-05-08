
import org.springframework.cloud.gateway.config.GlobalFilter;
import org.springframework.stereotype.Component;

@Component
public class CustomGatewayFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        System.out.println("Custom filter logic");
        return chain.filter(exchange);
    }
}
    