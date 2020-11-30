package com.neusoft.view;

import com.neusoft.domain.Business;

public interface BuisnessView {
    public void listAllBusiness();

    public void selectBusiness();

    public void saveBusiness();

    public void removeBusiness();

    public Business login();

    public void updatePassword(Integer businessId);
}
