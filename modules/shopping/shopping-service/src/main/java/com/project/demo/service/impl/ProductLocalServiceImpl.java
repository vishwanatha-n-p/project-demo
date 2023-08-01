/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.project.demo.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.project.demo.model.Product;
import com.project.demo.service.ProductLocalServiceUtil;
import com.project.demo.service.base.ProductLocalServiceBaseImpl;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ProductLocalServiceImpl extends ProductLocalServiceBaseImpl {

    public List<Product> getProductsByGender(String gender) {
        DynamicQuery dynamicQuery = ProductLocalServiceUtil.dynamicQuery();
        dynamicQuery.add(PropertyFactoryUtil.forName("gender").eq(gender));
        List<Product> products = ProductLocalServiceUtil.dynamicQuery(dynamicQuery);
        return products;
    }

}