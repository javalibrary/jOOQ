/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.example.jpa.jooq.tables.Language;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LanguageRecord extends UpdatableRecordImpl<LanguageRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1508361136;

    /**
     * Setter for <code>PUBLIC.LANGUAGE.LANGUAGEID</code>.
     */
    public void setLanguageid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.LANGUAGE.LANGUAGEID</code>.
     */
    public Integer getLanguageid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.LANGUAGE.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.LANGUAGE.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Language.LANGUAGE.LANGUAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Language.LANGUAGE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getLanguageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord value1(Integer value) {
        setLanguageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LanguageRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LanguageRecord
     */
    public LanguageRecord() {
        super(Language.LANGUAGE);
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    public LanguageRecord(Integer languageid, String name) {
        super(Language.LANGUAGE);

        set(0, languageid);
        set(1, name);
    }
}
