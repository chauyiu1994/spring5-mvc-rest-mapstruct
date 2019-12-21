package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring",
        injectionStrategy =  InjectionStrategy.CONSTRUCTOR,
        imports = guru.springfamework.api.v1.mapper.formater.VendorFormatter.class)
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    @Mapping(target = "vendorUrl", expression = "java(VendorFormatter.toVendorUrl(vendor.getId()))")
    VendorDTO vendorToVendorDto(Vendor vendor);

    Vendor vendorDtoToVender(VendorDTO vendorDTO);
}
