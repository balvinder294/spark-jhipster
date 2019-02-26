package com.tekraze.sparkhipster.repository;

import com.tekraze.sparkhipster.domain.Book;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Spring Data Cassandra repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends CassandraRepository<Book, UUID> {

}
