create table FOO_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table Shopping_Product (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	productName VARCHAR(75) null,
	color VARCHAR(75) null,
	ratingCount LONG,
	rating DOUBLE,
	price LONG,
	discount INTEGER,
	finalPrice LONG,
	gender VARCHAR(75) null,
	productCount INTEGER,
	status INTEGER,
	createDate DATE null,
	modifiedDate DATE null
);