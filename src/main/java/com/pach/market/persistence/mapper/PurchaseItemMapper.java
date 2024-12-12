package com.pach.market.persistence.mapper;

import com.pach.market.domain.PurchaseItem;

import com.pach.market.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {
    @Mappings(
            {
                    @Mapping(source="id.idProducto" , target = "productId"),
                    @Mapping(source = "cantidad", target = "quantity"),
                    @Mapping(source = "total", target = "totalProducts"),
                    @Mapping(source = "estado", target = "active"),
            }
    )
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    @InheritInverseConfiguration
    @Mapping(target = "producto", ignore = true)
    @Mapping(target = "compra",ignore = true)
    @Mapping(target = "id.idCompra", ignore = true)
    ComprasProducto toComprasProducto(PurchaseItem item);

}
