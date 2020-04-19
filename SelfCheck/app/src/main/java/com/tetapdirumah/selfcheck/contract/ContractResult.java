package com.tetapdirumah.selfcheck.contract;

import com.tetapdirumah.selfcheck.model.FormDiagnose;

public class ContractResult {
    public interface Presenter{
        void postData();
    }

    public interface View{
        void initializeData();
        FormDiagnose getDiagnose();
        void showMessage(String s);
        void btnShow();
        void showLoadingAnimation();
        void disposeLoadingAnimation();
        void saveData(String nama, String covid, String flu, String cold, String date_created);
    }
}
