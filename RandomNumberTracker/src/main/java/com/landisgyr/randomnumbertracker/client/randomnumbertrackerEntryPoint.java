package com.landisgyr.randomnumbertracker.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.ArrayList;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class randomnumbertrackerEntryPoint implements EntryPoint {
  private final RandomNumberTrackerServiceAsync randomNumberTrackerService = GWT.create(RandomNumberTrackerService.class);
  private final ClientConstants constants = GWT.create(ClientConstants.class);
  private  TextBox inputField;
  private  TextButton textButton;
  private VerticalPanel formBox;

  public static boolean isInteger(String s) {
      try {
          Integer.parseInt(s);
      } catch(NumberFormatException e) {
          return false;
      }
      // only got here if we didn't return false
      return true;
  }

  @Override
  public void onModuleLoad() {
      inputField = new TextBox();

      textButton = new TextButton("Submit");
      final Label enterNumberLabel = new Label();
      enterNumberLabel.setText(constants.enterNumber());

      final VerticalPanel inputForm = new VerticalPanel();
      HorizontalPanel hPanel = new HorizontalPanel();
      hPanel.add(enterNumberLabel);
      hPanel.add(inputField);
      hPanel.add(textButton);
      hPanel.setSpacing(10);
      inputForm.add(hPanel);

      formBox = new VerticalPanel();
      formBox.add(inputForm);
      formBox.setCellHorizontalAlignment(inputForm, VerticalPanel.ALIGN_CENTER);
      formBox.setCellVerticalAlignment(inputForm, VerticalPanel.ALIGN_MIDDLE);
      formBox.setCellHeight(inputForm, "100%");
      formBox.setStyleName("fullWidth");
      formBox.addStyleName("fullHeight");

      final VerticalPanel report = new VerticalPanel();
      report.setWidth("40%");
      formBox.add(report);
      formBox.setCellHorizontalAlignment(report, VerticalPanel.ALIGN_CENTER);


      RootPanel.get().add(formBox);
      textButton.addSelectHandler(new SelectHandler() {
      @Override
      public void onSelect(SelectEvent event) {

          int integerCount = 0;
          if (isInteger(inputField.getText())) {
              integerCount = Integer.parseInt(inputField.getText());
          }
          randomNumberTrackerService.getFirstDigitCountReport(integerCount, new AsyncCallback<ArrayList<FirstDigitCount>>() {
              public void onFailure(Throwable caught) {

              }

              public void onSuccess(ArrayList<FirstDigitCount> result) {
                  report.clear();
                  HorizontalPanel hHeader = new HorizontalPanel();
                  Label reportHeader1 = new Label();
                  reportHeader1.setText(constants.reportHeader1());
                  hHeader.add(reportHeader1);

                  Label reportHeader2 = new Label();
                  reportHeader2.setText(constants.reportHeader2());
                  hHeader.add(reportHeader2);

                  hHeader.setWidth("20%");
                  report.add(hHeader);

                  for(FirstDigitCount firstDigitCount: result) {
                      HorizontalPanel hData = new HorizontalPanel();
                      Label colData1 = new Label();
                      colData1.setText(firstDigitCount.getFirstDigitNumber() + "");
                      hData.add(colData1);
                      hData.setCellHorizontalAlignment(colData1, VerticalPanel.ALIGN_CENTER);


                      Label colData2 = new Label();
                      colData2.setText(firstDigitCount.getFirstDigitCount() + "");
                      hData.add(colData2);
                      hData.setWidth("20%");
                      hData.setCellHorizontalAlignment(colData2, VerticalPanel.ALIGN_CENTER);
                      report.add(hData);
                  }

              }
          });

      }
    });
  }
  
}
