package com.tekraze.sparkhipster.service.mapper;

import com.tekraze.sparkhipster.domain.*;
import com.tekraze.sparkhipster.service.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Book and its DTO BookDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BookMapper extends EntityMapper<BookDTO, Book> {


}
