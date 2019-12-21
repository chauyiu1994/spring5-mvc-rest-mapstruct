package guru.springfamework.api.v1.mapper.formater;

import org.springframework.stereotype.Component;

@Component
public class VendorFormatter {

    public static String toVendorUrl(Long id) {

        return "/api/v1/vendors/" + id;
    }
}
