create index IX_CFFD06FF on FOO_Foo (field2);
create index IX_B2FCA947 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_905CD589 on FOO_Foo (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7DA3631C on Shopping_Product (productName[$COLUMN_LENGTH:75$], color[$COLUMN_LENGTH:75$], gender[$COLUMN_LENGTH:75$]);
create index IX_4FABDD16 on Shopping_Product (uuid_[$COLUMN_LENGTH:75$]);