package guru.springfamework.api.v1.mapper.formater;

import org.springframework.stereotype.Component;

@Component
public class CustomerFormater {

    public static String toCustomerUrl(Long id) {

        return "/api/v1/customers/" + id;
    }
}
