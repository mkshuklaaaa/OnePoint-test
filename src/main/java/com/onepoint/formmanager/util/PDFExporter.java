package com.onepoint.formmanager.util;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.onepoint.formmanager.entity.Form;
import com.onepoint.formmanager.entity.FormSubmission;
import com.onepoint.formmanager.entity.Question;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PDFExporter {

    public static ByteArrayInputStream exportSubmissionsToPDF(Form form, List<FormSubmission> submissions) {

    }
}
