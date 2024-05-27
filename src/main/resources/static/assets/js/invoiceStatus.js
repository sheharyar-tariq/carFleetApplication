$('document').ready(function(){
    $('.table #editInvoiceStatus').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (invoiceStatus,status){
            $('#invoiceStatusId').val(invoiceStatus.invoiceStatusId);
            $('#editDetails').val(invoiceStatus.details);
            $('#editDescription').val(invoiceStatus.description);

        })

        $('#editModal').modal();
    });

    $('.table #deleteInvoiceStatus').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});