$('document').ready(function(){
    $('.table #editVehicleMake').on('click',function(event){
        event.preventDefault();
        let href = $(this).attr('href')
        $.get(href,function (vehicleMake,status){
            $('#vehicleMakeId').val(vehicleMake.vehicleMakeId);
            $('#editDetails').val(vehicleMake.details);
            $('#editDescription').val(vehicleMake.description);

        })

        $('#editModal').modal();
    });

    $('.table #deleteVehicleModel').on('click',function (event){
        event.preventDefault();
        const href = $(this).attr('href')
        $('#confirmedDelete').attr('href',href);
        $('#deleteModal').modal();
    });
});