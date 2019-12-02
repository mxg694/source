package comsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import provider.api.UserApi;

@FeignClient("cloud-provide")
public interface UserFeignClient extends UserApi {



}
