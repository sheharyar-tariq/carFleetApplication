$('document').ready(function(){
    $('.table #editVehicleStatus').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (vehicleStatus,status){
            $('#vehicleStatusId').val(vehicleStatus.vehicleStatusId);
            $('#editDetails').val(vehicleStatus.details);
            $('#editDescription').val(vehicleStatus.description);

        })

        $('#editModal').modal();
    });

    $('.table #deleteVehicleStatus').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});