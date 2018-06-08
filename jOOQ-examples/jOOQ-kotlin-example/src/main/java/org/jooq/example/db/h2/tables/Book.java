/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.db.h2.Indexes;
import org.jooq.example.db.h2.Keys;
import org.jooq.example.db.h2.Public;
import org.jooq.example.db.h2.tables.records.BookRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.0-SNAPSHOT"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book extends TableImpl<BookRecord> {

    private static final long serialVersionUID = -1555387226;

    /**
     * The reference instance of <code>PUBLIC.BOOK</code>
     */
    public static final Book BOOK = new Book();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookRecord> getRecordType() {
        return BookRecord.class;
    }

    /**
     * The column <code>PUBLIC.BOOK.ID</code>.
     */
    public final TableField<BookRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.BOOK.AUTHOR_ID</code>.
     */
    public final TableField<BookRecord, Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK.CO_AUTHOR_ID</code>.
     */
    public final TableField<BookRecord, Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BOOK.DETAILS_ID</code>.
     */
    public final TableField<BookRecord, Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BOOK.TITLE</code>.
     */
    public final TableField<BookRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK.PUBLISHED_IN</code>.
     */
    public final TableField<BookRecord, Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BOOK.LANGUAGE_ID</code>.
     */
    public final TableField<BookRecord, Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BOOK.CONTENT_TEXT</code>.
     */
    public final TableField<BookRecord, String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>PUBLIC.BOOK.CONTENT_PDF</code>.
     */
    public final TableField<BookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>PUBLIC.BOOK.REC_VERSION</code>.
     */
    public final TableField<BookRecord, Integer> REC_VERSION = createField("REC_VERSION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BOOK.REC_TIMESTAMP</code>.
     */
    public final TableField<BookRecord, Timestamp> REC_TIMESTAMP = createField("REC_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP.precision(23), this, "");

    /**
     * Create a <code>PUBLIC.BOOK</code> table reference
     */
    public Book() {
        this(DSL.name("BOOK"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK</code> table reference
     */
    public Book(String alias) {
        this(DSL.name(alias), BOOK);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK</code> table reference
     */
    public Book(Name alias) {
        this(alias, BOOK);
    }

    private Book(Name alias, Table<BookRecord> aliased) {
        this(alias, aliased, null);
    }

    private Book(Name alias, Table<BookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Book(Table<O> child, ForeignKey<O, BookRecord> key) {
        super(child, key, BOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FK_T_BOOK_AUTHOR_ID_INDEX_1, Indexes.FK_T_BOOK_CO_AUTHOR_ID_INDEX_1, Indexes.PRIMARY_KEY_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BookRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookRecord> getPrimaryKey() {
        return Keys.PK_T_BOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookRecord>> getKeys() {
        return Arrays.<UniqueKey<BookRecord>>asList(Keys.PK_T_BOOK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BookRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookRecord, ?>>asList(Keys.FK_T_BOOK_AUTHOR_ID, Keys.FK_T_BOOK_CO_AUTHOR_ID);
    }

    public Author fkTBookAuthorId() {
        return new Author(this, Keys.FK_T_BOOK_AUTHOR_ID);
    }

    public Author fkTBookCoAuthorId() {
        return new Author(this, Keys.FK_T_BOOK_CO_AUTHOR_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book as(String alias) {
        return new Book(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book as(Name alias) {
        return new Book(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Book rename(String name) {
        return new Book(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Book rename(Name name) {
        return new Book(name, null);
    }
}
