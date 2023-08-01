package com.web.project.demo.actions;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.service.ImageLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.project.demo.model.Product;
import com.project.demo.service.ProductLocalServiceUtil;
import com.web.project.demo.constants.ShoppingWebPortletKeys;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.PortletException;
import java.awt.*;
import java.util.List;


@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ShoppingWebPortletKeys.SHOPPINGWEB,
                "mvc.command.name=" + "/view/products"
        },
        service = MVCRenderCommand.class
)
public class ViewProductsMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        getAllProducts(renderRequest, renderResponse);
        return "/products.jsp";
    }

    public void getAllProducts(RenderRequest renderRequest, RenderResponse renderResponse) {

        String gender = ParamUtil.getString(renderRequest, "gender");

        List<Product> products = null;

        if (gender != null) {
            products = ProductLocalServiceUtil.getProductsByGender(gender);
        }

        if (Validator.isNotNull(products)) {
            List<JSONObject> productsList = null;
            for (Product product : products) {

                JSONObject jsonProduct = JSONFactoryUtil.createJSONObject();
                jsonProduct.put("product", product);
                productsList.add(jsonProduct);
            }

            renderRequest.setAttribute("productsList", productsList);

        }
    }

}
